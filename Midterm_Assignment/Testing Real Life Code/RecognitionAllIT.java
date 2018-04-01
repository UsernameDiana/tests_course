package net.sf.javaanpr.test;

import net.sf.javaanpr.imageanalysis.CarSnapshot;
import net.sf.javaanpr.intelligence.Intelligence;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author diana
 */
@RunWith(Parameterized.class)
public class RecognitionAllIT {

    private Intelligence intel;
    private String expectedResult;
    private File file;

    public RecognitionAllIT(File f, String expectedResult) {
        this.file = f;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        intel = new Intelligence();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> checkPlate() throws IOException {
        String snapshotDirPath = "src/test/resources/snapshots";
        String resultsPath = "src/test/resources/results.properties";
        InputStream resultsStream = new FileInputStream(new File(resultsPath));

        Properties properties = new Properties();
        properties.load(resultsStream);
        resultsStream.close();
        assertTrue(properties.size() > 0);

        File snapshotDir = new File(snapshotDirPath);
        File[] snapshots = snapshotDir.listFiles();
        assertNotNull(snapshots);
        assertTrue(snapshots.length > 0);

        Collection<Object[]> results = new ArrayList<>();
        for (File snap : snapshots) {
            String snapName = snap.getName();
            String plateCorrect = properties.getProperty(snapName);
            assertNotNull(plateCorrect);

            results.add(new Object[]{snap, plateCorrect});
        }
        return results;
    }

    @Test
    public void recogniseIt() throws IOException {
        CarSnapshot carSnap = new CarSnapshot(new FileInputStream(file));
        String read = intel.recognize(carSnap);
        assertThat(carSnap, notNullValue());
        assertThat(read, notNullValue());
        assertThat(expectedResult, is(read));
    }

}
