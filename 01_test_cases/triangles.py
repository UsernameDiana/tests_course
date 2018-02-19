print("Input lengths of the triangle sides: ")


def triangle_check(l1, l2, l3):
    if (l1 > l2 + l3) or (l2 > l1 + l3) or () or (l3 > l1 + l2):
        print('No, the values wont form a triangle')
    if (l1 == 0) or (l2 == 0) or (l3 == 0):
        print('No, the 0 wont form a triangle')
    else:
        print('Yes, a triangle can be formed out of it:')

        if l1 == l2 == l3:
            print("Equilateral triangle")
        elif l1 != l2 != l3:
            print("Scalene triangle")
        else:
            print("isosceles triangle")

length1 = int(input('enter side a\n'))
length2 = int(input('enter side b\n'))
length3 = int(input('enter side c\n'))

triangle_check(length1, length2, length3)
