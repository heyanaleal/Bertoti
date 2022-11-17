import {searchAPIQ} from '../fragments/APIfunction';
import CreateTrackCard from '../fragments/CreateTrackCard';
import alert from '../fragments/alert';
export default class Search {

    constructor() {
        this.view = 'search.html';
    }

    init() {
        /* DIV DEEZER */
        let deezerAPI = document.getElementById('api-deezer');

        /* Furmulario buscar musica */
        let searchMusicForm = document.getElementById('searchMusicForm'),
            /* campo de texto buscar */
            maRecherche = document.getElementById('maRecherche'),
            /* classificar musica */
            monTri = document.getElementById('tri');
        /* LOCALSTORAGE */
        let dataFavorites = [];
        if (localStorage.getItem('myMusicsAPIDeezer') !== null) {
            dataFavorites = localStorage.getItem('myMusicsAPIDeezer').split(",").map(Number);
        }

        $('#randomButton').remove();

        /*para o formulario */
        searchMusicForm.addEventListener('submit', function (event) {
            event.preventDefault();

            $('.container-music').remove();

            /*recuperar VIA API*/
            searchAPIQ(maRecherche.value, monTri.value,
                function (musics) {
                    $('#api-deezer > div').remove();
                    /* Se a pesquisa não retornar resultados */
                    if(musics.data !== undefined && musics.data.length == 0)
                    {
                        deezerAPI.appendChild(alert('Não encontrado'));
                    }
                    else{
                        for (const musicKey in musics.data) {
                        /* EXIBIÇÃO DE MÚSICA */
                        deezerAPI.appendChild(CreateTrackCard(musics.data[musicKey],dataFavorites));
                        }
                    }                   
                },
                function () {
                    // DISPLAY EM CASO DE ERROS
                    $('#api-deezer > div').remove();
                    deezerAPI.appendChild(alert('error','Erro','Ocorreu um erro durante a solicitação, verifique sua conexão com a internet. Se o problema persistir, entre em contato com o suporte.</p>'));
                });
        })
    }
}