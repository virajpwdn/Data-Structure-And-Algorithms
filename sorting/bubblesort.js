function main() {
    let arr = [5,2,4,1,0];

    for(let i=0; i<arr.length-1; i++) {
        let min = arr[i];
        for(let j=0; j<arr.length-1 - i; j++) {
            let max = arr[j];
            if(arr[j] > arr[j+1]) {
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    loop(arr)
}


function loop(arr) {
    for(let i = 0; i < arr.length; i++) {
        console.log("ARR VALUES - ", arr[i]);
    }
}

main()