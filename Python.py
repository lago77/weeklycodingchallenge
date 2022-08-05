import time
import math
def digits_count(i,count):
    # print("i outside of while loop: "+str(i))
    #i+=1
    z=math.floor(i/10)
 
    
    if (z==0):
        # print("z is 0")
        count+=1
        # print("count in z==0 "+str(count))
        return count
    else:
        remainder= i%10
        i=i-remainder
        i=i/10
        count+=1
        
        count = digits_count(i,count)
        return count
    """
    print("i after increment: "+str(i))
    while(i<5):
        print("*****")
        print("in while loop")
        print("i in while loop: "+str(i))
        i=numDigits(i)
   
        print("i after function call: "+str(i))
        print("//////")
    print("after while loop")
    """




def main():
    #print("Hello World!")
    count=0
    a=digits_count(1289396387328,count)
    x=0.1
    y=10
    z=x%y

    test1 = digits_count(4666,count)
    print(test1)
    test2 = digits_count(544,count)
    print(test2)
    test3 = digits_count(121317,count)
    print(test3)
    test4 = digits_count(0,count)
    print(test4)
    test5 = digits_count(12345,count)
    print(test5)
    test6 = digits_count(1289396387328,count)
    print(test6)

if __name__ == "__main__":
    main()
