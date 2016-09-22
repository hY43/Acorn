'''
Created on 2016. 9. 21.

@author: kitcoop
'''
#list : 순서가 있으며, 수정가능한 자료형, 중복데이터 허용
a = [1, 2, 3]
b = [10, a, 10.5, True, '문자열']  #list는 집합형 자료
print(a)
print(a[1]) # '2' 출력하기

print(b)
print(b[1][2]) # 이렇게 하면 b list안의 [1] = a의 리스트의 [2]= 3을 출력함.

print("id(a) : ",id(a))
print("id(b) : ",id(b))

print("====list는 값의 수정이 가능하다.====")
a[0] = 100
print(a)    #list는 값의 수정이 가능하다.
fa = ["엄마","아빠","나","동생"]
print("len(fa) : ",len(fa))

fa.append("고모") #추가
print("len(fa) : ",len(fa))

fa.remove("고모") #제거
print("len(fa) : ",len(fa))

fa.insert(0,"할아버지") #삽입
print("len(fa) : ",len(fa))

fa.extend(["삼촌","숙모"])  #확장
print("len(fa) : ",len(fa))
print(fa)

fa += ["은주","주명"]   #확장1-1
print("len(fa) : ",len(fa))
print(fa)

fa += '한글자씩' #확장1-2 (한글자씩 추가)
print("len(fa) : ",len(fa))
print(fa)

del fa[0]   #삭제
print("len(fa) : ",len(fa))
print(fa)

print("=======숫자 정렬=========")
ss = [3,1,4,6,22,44]
print(ss)
ss.sort()   #오름차순으로 정렬
print(ss)
ss.sort(reverse=True)   #내림차순으로 정렬
print(ss)

print("=======문자 정렬=========")
ss2 = ['123','34','234']
ss2.sort(); #앞글자의 ASCII코드 순으로 오름차순으로 정렬됨
print("앞글자의 ASCII코드 순으로 오름차순 정렬 : ",ss2)
#숫자형으로 인식하게 한 후 오름차순 정렬
ss2.sort(key=int)
print("숫자형 오름차순 정렬: ", ss2)
#숫자형으로 인식하게 한 후 내림차순 정렬
ss2.sort(key=int, reverse=True)
print("숫자형 내림차순 정렬: ",ss2)
