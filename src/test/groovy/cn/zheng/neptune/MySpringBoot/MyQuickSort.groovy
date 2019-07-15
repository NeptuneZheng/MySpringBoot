package cn.zheng.neptune.MySpringBoot

class MyQuickSort {
    public static void sort(int low, int high, int[] arrs, boolean isLow){
        if(low > high){
            return
        }

        int tmp = arrs[low]
        int i = low
        int j = high

        while (i < j){
            while (i < j && arrs[j] >= tmp){
                j --
            }

            while (i < j && arrs[i] <= tmp){
                i ++
            }

            if(i < j){
                int x = arrs[i]
                arrs[i] = arrs[j]
                arrs[j] = x
            }
        }

        arrs[low] = arrs[i]
        arrs[i] = tmp

        println(isLow.toString() + " --- " + arrs)

        println("***************************")
        sort(low,i-1,arrs,true)
        sort(i+1,high,arrs,false)
    }

    public static void main(String[] args) {
        int[] test = [10,9,12,87,6,6,8,6,1,98,11,36,458,2,8]
        sort(0,test.length -1,test,true)
        println(test)
    }
}
