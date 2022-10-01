from collections import Counter
t = int(input())
while t>0:
    n = int(input())
    a = list(map(int, input().split()))
    
    sdict=Counter(a)
    
    count_each = []
    
    for i in sdict.values():
        count_each.append(i)
    
    count_each.sort()
    
    if(len(count_each)==0):
        print("0")
    else:
        summ = 0
        for j in range(0, len(count_each)-1):
            summ = summ + count_each[j]
        print(summ)
    t -= 1
