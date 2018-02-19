print("Input lengths of the triangle sides: ")


def classify_triangle(a, b, c):
    a, b, c = sorted([a, b, c])
    if not (a + b) > c:
        return 'not valid'
    if (a == 0) or (b == 0) or (c == 0):
        return 'not valid'
    if a == b == c:
        return 'equilateral'
    elif (a == b) or (b == c) or (a == c):
        return 'isosceles'

length1 = int(input('enter side a\n'))
length2 = int(input('enter side b\n'))
length3 = int(input('enter side c\n'))

print(classify_triangle(length1, length2, length3))
