/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;

/**
 *
 * @author WINDOWS 10
 */
public class MergeSort {
    
  public static void main(String a[]){
  int i;
  int array[] = {12,9,4,99,120,1,3,10};
  

  System.out.println("Values Before the sort:\n");
  for(i = 0; i < array.length; i++)
  System.out.print( array[i]+"  ");
  System.out.println();
  mergeSort_srt(array,0, array.length-1);
  System.out.print("Values after the sort:\n");
  for(i = 0; i <array.length; i++)
  System.out.print(array[i]+"  ");
  System.out.println();
  
  }
  public static void mergeSort_srt(int array[],int lo, int n){
  int low = lo;
  int high = n;
  if (low >= high) {
  return;
  }
  int middle = (low + high) / 2;
  mergeSort_srt(array, low, middle);
  mergeSort_srt(array, middle + 1, high);
  int end_low = middle;
  int start_high = middle + 1;
  while ((lo <= end_low) && (start_high <= high)) {
  if (array[low] < array[start_high]) {
  low++;
  } else {
  int Temp = array[start_high];
  for (int k = start_high- 1; k >= low; k--) {
  array[k+1] = array[k];
  }
  array[low] = Temp;
  low++;
  end_low++;
  start_high++;
  }
  }
  } 
}
    

