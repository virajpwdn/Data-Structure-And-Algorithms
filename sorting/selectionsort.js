function selectionSort(arr) {
  for (let i = 0; i < arr.length-1; i++) {
    let minPos = i;

    for (let j = i+1; j < arr.length; j++) {
      if (arr[j] < arr[minPos]) minPos = j;
    }
    // Swap
    swap(arr, i, minPos);
  }
  return arr
}

function swap(arr, num1, num2) {
  let temp = arr[num1];
  arr[num1] = arr[num2];
  arr[num2] = temp;
}

function printArr(arr) {
  let i = 0;
  while (i < arr.length) {
    console.log(arr[i]);
    i++;
  }
}

function main() {
  let arr = [7, 1, 5, 4, 3, 2];
  let result = selectionSort(arr);
  console.log(result)
//   printArr(arr);
}


main()