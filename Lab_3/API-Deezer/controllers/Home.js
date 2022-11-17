import {searchAPITracks} from '../fragments/APIfunction';
import CreateTrackCard from '../fragments/CreateTrackCard';
import alert from '../fragments/alert';
export default class Home {
    constructor() {
        this.view = 'home.html';
    }

    init() {
        /* DIV DEDIER A DEEZER */
        let deezerAPI = document.getElementById('api-deezer');
        /* LOCALSTORAGE */
        let dataFavorites = [];
        if (localStorage.getItem('myMusicsAPIDeezer') !== null) {
            dataFavorites = localStorage.getItem('myMusicsAPIDeezer').split(",").map(Number);
        }
        let actuelMusic;

        $('#randomButton').remove();

        function SearchOnApiDeezer(dataFavorites, actuelMusic) {
            $('.container-music').remove();
            $('.div-error').remove();

            /* Gestão da aleatoriedade */
            /* ESCOLHA ALEATORIAMENTE UMA MÚSICA FAVORITA */
            let myRandomFavorite = Math.floor(Math.random() * Math.floor(dataFavorites.length));
            if (actuelMusic !== undefined) {
                if (dataFavorites.length > 1) {
                    while (myRandomFavorite == actuelMusic) {
                        myRandomFavorite = Math.floor(Math.random() * Math.floor(dataFavorites.length));
                    }
                }
            }

            /*RECUPERAR VIA API*/
            searchAPITracks(dataFavorites[myRandomFavorite],
                function (musics) {
                        /* EXIBIÇÃO DE MÚSICA*/
                        deezerAPI.appendChild(CreateTrackCard(musics,dataFavorites));
                   
                },
                function () {
                    /* EXIBIÇÃO EM CASO DE ERROS*/
                    deezerAPI.appendChild(alert('erro','Erro','Ocorreu um erro durante a solicitação, verifique sua conexão com a Internet.</p>'));
                });
            return myRandomFavorite;
        }

        if (dataFavorites.length < 1) {
            $('#randomButton').remove();
            if (dataFavorites.length == 0) {
                $('#randomButton').remove();
                $('.container-music').remove();
            }
        } else {
            SearchOnApiDeezer(dataFavorites);

            /* Btn aleatorio */
            let randomButton = document.createElement('input');
            randomButton.type = 'button';
            randomButton.id = 'randomButton';
            randomButton.value = 'Mudar de música aleatoriamente';
            randomButton.addEventListener('click', function () {
                actuelMusic = SearchOnApiDeezer(dataFavorites, actuelMusic);
            });
            deezerAPI.after(randomButton);
        }

    }
}