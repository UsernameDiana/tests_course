import unittest

from triangles import classify_triangle


class ClassifyTriangleTest(unittest.TestCase):
    def test_equilateral(self):
        result = classify_triangle(2, 2, 2)
        self.assertEquals(result, 'equilateral')

    def test_isosceles(self):
        result = classify_triangle(2, 2, 1)
        self.assertEquals(result, 'isosceles')

        result = classify_triangle(2, 1, 2)
        self.assertEquals(result, 'isosceles')

        result = classify_triangle(1, 2, 2)
        self.assertEquals(result, 'isosceles')

    def test_scalene(self):
        result = classify_triangle(3, 4, 5)
        self.assertEquals(result, 'scalene')

    def test_invalid_isosceles(self):
        result = classify_triangle(1, 1, 10)
        self.assertEquals(result, 'not valid')

    def test_invalid_scalene(self):
        result = classify_triangle(1, 2, 5)
        self.assertEquals(result, 'not valid')

    def test_null_value(self):
        result = classify_triangle(0, 0, 0)
        self.assertEquals(result, 'not valid')


if __name__ == '__main__':
    unittest.main()
