package com.xhx.lang;

public class ArrayList<E> implements List<E>{
      
    private E[] array;
    private int capability;
    private int count;

    public ArrayList(){
    }

    public ArrayList(int capability){
          this.capability = capability;
          this.array = (E[])new Object[this.capability];
    }

    

    public boolean add(E o){
          //为空时创建长度为1的数组
          if(isEmpty()){
                  capability++;
                  array = (E[])new Object[this.capability];
          }else{
              //判断有效长度是否大于数值长度
              if(count>=capability){//扩容
        		  capability++;
   				
              	  E[] temp = (E[])new Object[this.capability];
                  System.arraycopy(array,0,temp,0,count);
                  array = temp;
                  temp = null;
              }
          }
          //添加元素
          array[count++]=o;
          return true;
    }

    public void add(int index,E o){
        if(index>=0&&index<count){
              if(count>=array.length){//需要扩容
                  capability++;
                  E[] temp = (E[])new Object[capability];
                  System.arraycopy(array,0,temp,0,count);
                  array = temp;
                  temp = null;
              }
              //复制后段
              System.arraycopy(array,index,array,index+1,count-index);
              //添加插入的元素
              array[index] = o;
              count++;
        }
    }

    public void clear(){
          this.count = 0;
          this.capability = 0;
          this.array = null;
    }

    public boolean contains(Object o){
          if(indexOf(o)==-1){
                return false;
          }else{
              return true;
          }
    }

    public E get(int index){
          if(index>=0&&index<count){
                return array[index];
          }else{
                return null;
          }
    }

    public int indexOf(Object o){
          if(isEmpty()){
              return -1;
          }
          for(int i = 0;i<count;i++){
                if(array[i].equals(o)){
                      return i;
                }
          }
          return -1;
    }

    public boolean isEmpty(){
          if(array==null||count==0||capability==0){
                return true;
          }else{
                return false;
          }
    }

    public E remove(int index){
          int i = indexOf(index);
          if(i==-1){
                return null;
          }else{
                E o = array[i];
                capability--;
                E[] temp = (E[])new Object[capability];
                //复制前一段
                System.arraycopy(array,0,temp,0,index);
                //复制后一段
                System.arraycopy(array,index+1,temp,index,array.length-1);
                array = temp;
                temp = null;

                return o;
          }
    }

    public boolean remove(Object o){
          int i = indexOf(o);
          if(i==-1){
              return false;
          }else{
              remove(i);
              return true;
          }
    }

    public E set(int index,E o){
          if(index>=0&&index<count){
                E old = array[index];
                array[index] = o;      
                return old;
          }
          return null;
    }

    public int size(){
    	if(isEmpty()){
        	return 0;
     	}else{
        	return count;
    	}
    }

    public Iterator<E> iterator(){
		return new Iterator(){
			int i = 0;
			// 判断是否有下一个元素
			public boolean hasNext(){
				if(i<array.length){
					if(indexOf(++i)==-1){return false;}
					else{return true;}
				}else{
					return false;
				}
			}
			// 获取下一个元素
			public E next(){
				return array[i];
			}
			// 删除获取的元素
			public void remove(){
	            	
			}
		};
    }
}
