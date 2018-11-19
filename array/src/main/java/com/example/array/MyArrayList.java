package com.example.array;

/**
 * 自定义类封装实现数组，实现基本功能：
 * 增加数据
 * 获取数据
 * 删除数据
 * 查找数据
 * 修改数据
 */

public class MyArrayList {

    private Object[] mArray;  //定义数组，可以存储任意数据类型 object

    private int size;//数组长度

    //无参构造，可以默认 大小
    public MyArrayList() {
        mArray = new Object[10];  //默认初始化 10 大小

    }

    //指定初始化大小
    public MyArrayList(int size) {
        mArray = new Object[size];
    }

    public int getSize() {
        if (mArray == null) {
            throw new NullPointerException("数组不能为空");
        }
        return size;
    }

    /**
     * 增加数据
     *
     * @param o
     */
    public void add(Object o) {
        mArray[size] = o;    //将数据增加到最后  ，size初始值为0 ，从0开始增加
        size++;

        //是否需要扩容
        if (size >= mArray.length) {
            //增加的数据 大于初始化的数组长度，装不下了自动扩容
            int newCapacity = size * 2;    //扩容2倍--类似hashmap 实现原理
            //将原来数组拷贝到新的数组
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < mArray.length; i++) {
                newArray[i] = mArray[i];
            }

            mArray = newArray;
        }

    }

    /**
     * 在固定的位置增加数据
     *
     * @param index
     * @param o
     */
    public void addWithIndex(int index, Object o) {
        isVaildIndex(index,"数组越界");
        size++;
        for (int i = index; i < size; i++) {
            mArray[i+1] = mArray[i];
        }
        mArray[index] = o;
//        Object[] newArray = new Object[size];
//        for (int i = 0; i < size; i++) {
//            newArray[i] = mArray[i];
//        }
//        mArray = newArray;

    }

    /**
     * 根据下标查找数据
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        isVaildIndex(index, "数组越界:不能获取数组外的数据");
        return mArray[index];
    }


    /**
     * 根据下标删除数据，将最后一个数据移动到删除的数据的位置，然后
     *
     * @param index
     */
    public void delete(int index) {
        isVaildIndex(index, "数组越界：不能删除数组外的数据");

        mArray[index] = mArray[size - 1];
        size--;

        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = mArray[i];
        }

        mArray = newArray;

    }

    /**
     * 根据下标删除数据，将需要删除的数据之后的数据往前移
     *
     * @param index
     */
    public void deleteWithIndex(int index) {
        isVaildIndex(index,"数组越界，不能删除数组长度外的数据 2 ");
        if (index < size-1){
            for (int i = 0; i < size-1; i++) {
                mArray[i+index] = mArray[i+index+1];
//                System.out.print("index1 :"+ mArray[i+index]);
            }
        }

        size--;
        //构建新的数组
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
//            System.out.print("index:"+ mArray[i]);
            newArray[i] = mArray[i];
        }
        mArray  = newArray;
    }

    /**
     * 修改元素
     * @param oldObj
     * @param newObj
     */
    public void find(Object oldObj,Object newObj){
        for (int i = 0; i < size; i++) {
            if (mArray[i] == oldObj){
                mArray[i] = newObj;
            }
        }
    }

    /**
     * 删除某一区间数据
     * @param start
     * @param end
     */
    public void deleteRange(int start,int end){
        if (start<0 || start>end || end>=size){
            throw new ArrayIndexOutOfBoundsException("数组下标不一致");
        }

        for (int i = 0; i < size; i++) {
            if (i+end >size){
                mArray[i+start] = null;
            }else {
                mArray[i+start] = mArray[i+end];
            }
        }

        size -=end-start;
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i]  = mArray[i];
        }
        mArray = newArray;
    }

    /**
     * 若在一个条件语句中抛出异常，则程序能被编译，但后面的语句不会被执行。
     * @param index
     * @param message
     */
    private void isVaildIndex(int index, String message) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(message);
        }
    }
}
