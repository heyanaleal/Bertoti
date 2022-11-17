export default function showError(type,h1,p){
    $('.div-error').remove();
    let divError = document.createElement('div');

    switch (type) {
        case 'aviso':
            divError.className = 'div-warning'; 
        break;
        case 'erro':
            divError.className = 'div-error';
        break;
    }

    divError.innerHTML = '  <h1> ' + h1 + ' </h1>' +
                         '<p> ' + p + '</p>';
    return divError;
   }