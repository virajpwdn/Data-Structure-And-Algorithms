function insertionSort(arr) {
  for (let i = 1; i < arr.length; i++) {
    let prev = i - 1;
    let curr = i;

    while (prev >= 0 && arr[prev] > arr[prev + 1]) {
      let temp = arr[prev];
      arr[prev] = arr[prev + 1];
      arr[prev + 1] = temp;

      prev--;
    }
  }
  return arr;
}

function main() {
  let arr = [4, 7, 3, 5, 1, 2, 0, 90, 9];
  let result = insertionSort(arr);
  console.log("Result", result);
}

main();
