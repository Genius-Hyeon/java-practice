# 1. 재귀 함수 

factorial(5)<br>
5! = 5 * (4 * (3 * (2 * 1)))

장점
- 코드 표현이 간단해짐

단점
- 성능 이슈 존재 가능
- 콜 스택이 많이 쌓이면 터질 수 있음

## 1.1. 재귀함수 작성 시 유의사항
- 탈출 조건 명시 필요

```java
    private static int factorial(int n) {
        //탈출 조건 
        if (n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
```

꼬리 재귀 최적화(tail recursion optimization)

## 1.2. 피보나치 문제

1 1 2 3 5 ...
- n번째 항(n > 2)은 n-1번째 항과 n-2번째 항의 합

An = A(n-1) + A(n-2)

# 2. quick Sort
- 추가적인 메모리 필요 없음
- sorting 속도 빠름

# 2.1. 알고리즘 

1. pivot 고르고
2. 왼쪽에는 pivot보다 작은 값의 배열(리스트)
3. 오른쪽에는 pivot보다 작은 값의 배열(리스트)