


function pairSums(listArr:number[],target:number ):{[key:number]:number}{

    let hashMap:{[key:number]:number} = {};
    let compliment :number;

    for(let i:number = 0; i < listArr.length; i++){

        let num:number = listArr[i];

        compliment = target - num;

        if (compliment in hashMap){
            return [i, hashMap[`${compliment}`]]
        }

        hashMap[num] = i;
    }
    return {};
}


console.log(pairSums([3, 2, 5, 4, 1], 8));