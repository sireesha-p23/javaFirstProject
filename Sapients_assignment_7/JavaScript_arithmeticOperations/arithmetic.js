function calculate(){
    //Obtaining the references to the text inputs
    var number1 = parseInt(document.getElementById('number1').value);
    var number2 = parseInt(document.getElementById('number2').value);

    //Reference of the result Box
    var resultBox = document.getElementById('result');
    resultBox.innerHTML = '';

    //Reference of the radio buttons
    var buttonAdd = document.getElementById('add');
    var buttonSubstract = document.getElementById('substract');
    var buttonMultiply = document.getElementById('multiply');
    var buttonDivision = document.getElementById('division');

    //Make the magic
    if(buttonAdd.checked == true){
        resultBox.innerHTML = number1 + number2
    }
    else{
        if(buttonSubstract.checked == true){
            resultBox.innerHTML = number1 - number2
        }
        else{
            if(buttonMultiply.checked == true){
                resultBox.innerHTML = number1 * number2
            }
            else{
                if(buttonDivision.checked == true){
                    resultBox.innerHTML = number1 / number2
                }
            }
        }
    }            
}

