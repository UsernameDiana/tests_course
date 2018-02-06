def console():
    try:
        n = input("Enter a Numbers: ")
        if n.isdigit():
            print ("Number you entered: ", n)
        else:
            print (n, "- is not a number :P")
    except Exception:
        print ("Incorrect data entered.")

console()
