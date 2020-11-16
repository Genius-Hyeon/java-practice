# Queue
- 선입선출
- 사용
    - 처리 순서가 중요한 이벤트 큐나 메세지 큐들에서 사용
   
# 연산
- enqueue: 들어가는 것
- dequeue: 나오는 것

## 2.1. 시나리오
enqueue(10)<br>
enqueue(20)<br>
enqueue(30)<br>
enqueue(40)<br>

dequeue() //10<br>
dequeue() //20<br>
dequeue() //30<br>
dequeue() //40<br>

## 2.2.

r=-1, f=-1
- rear: 뒷 부분, 나갈 요소를 가리킴
- front: 앞 부분, 들어올 요소 위치를 가리킴
```java
//1. enqueue(10)
//queue[++r] = 10
//[10][][][][]
//r = 0;

//2. enqueue(20)
//queue[++r] = 10
//[10][][][][]
//r = 0;

```
