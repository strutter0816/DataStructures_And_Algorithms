# 其实也就是双指针问题
## 定义两个指针 left and right
`left =0; 
right =array.length-1;`

有如下三种情况

1. 中间那个数就是要找的target 直接返回
2. target小于中间那个数 说明右边界应该更新到目前中间的数的左边一个
3. target大于中间的数 说明左边界应该更新到目前中间的数的右边一个
