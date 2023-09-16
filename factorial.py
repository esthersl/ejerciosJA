Python 3.10.0 (tags/v3.10.0:b494f59, Oct  4 2021, 19:00:18) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
def Factorial(n):
    producto =1
    for i in range(1, n +1):
        producto*=i
        return producto

    print(Factorial(5))
    