s=input().split()
for i in range(1,len(s)-1):
    s[i]=s[i][::-1]
print(*s)
