'''
Created on 2016. 9. 20.

python 특징
1. 플랫폼에 독립적
2. 인터프리터식 언어
3. 객체 지향 언어
4. 동적 타이핑이 가능 - 자료형은 자료형을 선언할때가 아니라 값을 초기화 할때 결정된다.
5. 가독성이 좋다.
6. Glue language - 다른 언어와의 결합이 쉽다
7. 유니코드를 지원
8. 라이브러리(모듈)이 풍부하다
9. free

@author: kitcoop
'''
print("hello");

#파이썬은 인터프리터 방식으로 에러나면 아래코드는 실행되지 않는다.

#pring("bbb");
print("aaa");

var1 = "안녕";
print(var1);
var1 = 5;
print(var1);

a = 10;
b = 20.5;
c = b;

print(a,b,c);
print("-------------- id(c) --------------");

print(a, id(a));
print(b, id(b));
print(c, id(c));
c = 222;

print("-------------- id(c) --------------");

print(a, id(a));
print(b, id(b));
print(c, id(c));

print("======================================");
print("is는 주소 비교 , ==는 값을 비교");
print(a is b, a == b);
print(a is c, a == c);
a = 10;
b = 10;
print(a is b, a == b);
print(a is c, a == c);

'''
+ 파이썬의 변수 규칙
1. A-Z, a-z, 0-9, _, $
2. 변수명은 숫자로 시작할 수 없다.
3. 예약어를 사용할 수 없다.
4. 의미있게 지정.
'''

# 예약어 리스트
import keyword # 외부 모듈 사용
print(keyword.kwlist);
print("======================================");
'''
+ 파이썬의 자료형
1. 문자
2. 수치(int, float, complex(복소수))
3. 부울(True, False)
4. list
5. set
6. tuple
7. dict
'''
print(7, type(7));
print(3.14, type(3.14));
print(3+2j, type(3+2j));
print(True, type(True));
print("a", type("a"));
print("======================================");

print((1,), type((1,))); # tuple
print([1], type([1])); # list
print({"k":1}, type({"k":1})); # dict
