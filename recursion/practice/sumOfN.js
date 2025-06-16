function sum(n, total) {
  if (n === 0) {
    console.log("Total Sum - ", total);
    return;
  }

  total += n;
  sum(n - 1, total);
}



function main() {
  let n = 10;
  let total = 0;
  sum(n, total)
}


main()