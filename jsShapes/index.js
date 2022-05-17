function trapezoid(w, h){
    if(h * 2 > w){
        console.log("impossible shape")
        return;
    } else {
        let result = ""
        for(let i = 0; i < h; i++){
            for(let j = 0; j <= w; j++){
                if(j === w){
                    result += "\n"
                }
               else if(j < i || j + i >= w){
                result += " "
            } else {
                result += "*"
            }
        }
    }
    console.log(result)
  }
}
trapezoid(12, 7)