function sumInArray(arr, i) {
    if(i === arr.length) {
        return 0
    }

    return arr[i] + sumInArray(arr, ++i)
}

function main() {
    let arr = [10,20,30,40,50]
    let i = 0
    let total = sumInArray(arr, i)
    console.log("Total Sum - ", total)
}

main()