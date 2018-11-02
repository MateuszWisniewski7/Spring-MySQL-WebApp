function clearFoo(){
    var list = document.getElementById("branches");
    var invalid = true;
    var input = document.getElementById("transientBranch").value.trim();
    console.log(input.length);
    if (input.split(" - ").length==2){
        input=input[1];}
    console.log(input);
    for (i=1;i<list.options.length-1;i++){
          console.log("petla"+ i);
          if (list.children[i]
                .value.split(" - ")[1]
                .substring(0,input.length)
                .toUpperCase()==input.toUpperCase()){
                    console.log("funkcja if");
                    invalid = false;
                    break;
                }
                console.log("po funkcji if");
        }
    if (invalid){
        console.log("ucinanie stringa")
        document.getElementById("transientBranch").value=input.substring(0,input.length-1);
    }
    document.getElementById("branch").value=
}