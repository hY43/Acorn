'''
Created on 2016. 9. 21.

@author: kitcoop
'''
a = 3;
b = 2;
print(" a = ", a, " b = ", b);
# Q2, a = 2, b = 3 이라 출력
a, b = b, a;

print(" a = ", a, " b = ", b);

a = b = c = 3;
print(a, b, c);
print(id(a), id(b), id(c));
print(type(a), type(b), type(c));

# * : 패킹 연산자
v1, *v2 = 1, 2, 3, 4, 5;
print(v1, v2);
print(v2[1]);
*v1, v2, v3 = 1, 2, 3, 4, 5;
print(v1, v2, v3);

# 산술 연산자
print(5+3, 5-3, 5*3, 5/3);
print(5//3, 5%3, divmod(5,3));
# divmod: 몫과 나머지를 tuple 타입으로 반환.
# [1,2,3,4,]: List
# (1,2): tuple

print(3+4, (3+4)*2);
print("==========================");
print("관계 연산자");
print(5>4, 3==5, 5!=3);

print(5>3 and 4<3);
print(10>1 or 5<2);

print("문자열 더하기", end="abc");
print("대한" + "민국");
print("한국"*10);

print("==========================");

print(bool(True), bool(False), bool(0));
print(bool(1), bool(10), bool(-35));
# 0이외의 값은 True
print(bool(''), bool(None));
print(int(30.2));

print("==========================");

s="sequence"
print("길이 : ", len(s))  #len(변수명) : 변수의 길이를 알아올 수 있음.
print("e글자의 포함 횟수 : ",s.count("e"))
print("e몇번째 글자 : ",s.find('e'))
#print("3번째 e는 몇 번째 글자", s.find('e',3)) ==> 2번째랑 3번째 결과가 같음
print("뒤에서 첫번째 e는 몇 번째 글자", s.rfind('e'))

print("======문자열의 일부만 뽑아서 추출========")
ss = 'abc'
print('abc',ss,id(ss))
#문자열의 일부만 뽑아서 추출
print(s, s[0],s[2:5], s[3:]) #s[2:5] : 2번째 글자부터 5번째 전까지, s[3:] : 3번째글자부터 끝까지
print(s[-1], s[-4:-1]) #뒤에서 4번째부터 뒤에서 첫번째까지

print("=========문자열 일부 추출 문제=========")
#문제) Hello World 문자열에서 o Wor 문자열을 추출하여 출력
ex = "Hello World"
print(ex[4:9]) # o Wor 이 출력됨.

print("==========간격을 지정하여 문자열 한글자씩 잘라오기==========")
print(s[1:7:2])# 1번부터 7번까지 2씩 증가하면서 
print(s[::2]) # 처음부터 끝까지 2칸 간격으로 한문자씩 잘라와서 출력함
#문제) Hello World 문자열에서 처음부터 끝까지 3의배수로 문자열을 잘라서 출력
print(ex[::3]);