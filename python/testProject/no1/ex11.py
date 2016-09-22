'''
while
'''

a = 1;
while a <= 5:
    print(a, end="\t"); # end: 출력 후 뒷부분
    a += 1;

print("\n===============================================");

# 문제 사용자로 부터 입력 받은 단을 출력하세요
dan = int(input("몇단이요?"));
i = 1;
while i<=9 :
    print("%d * %d = %d" %(dan, i,(dan*i)));
    i+=1;