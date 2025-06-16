function sumInArray(arr, i) {
    if(i === arr.length) {
        return 0
    }

    return arr[i] % 2 !== 0 ? arr[i] + sumInArray(arr, ++i) : 0
}

function main() {
    let arr = [1,25,27,40,50]
    let i = 0
    let total = sumInArray(arr, i)
    console.log("Total Sum - ", total)
}

main()