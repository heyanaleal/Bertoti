import {searchAPITracks} from '../fragments/APIfunction';
import CreateTrackCard from '../fragments/CreateTrackCard';
import alert from '../fragments/alert';
export default class Favorite {

    constructor() {
        this.view = 'favorites.html';
    }

    init() {
        /* DIV DEEZER */
        let deezerAPI = document.getElementById('api-deezer');
        /* LOCALSTORAGE */
        let dataFavorites = [];
        if (localStorage.getItem('myMusicsAPIDeezer') !== null) {
            dataFavorites = localStorage.getItem('myMusicsAPIDeezer').split(",").map(Number);
        }

        $('.container-music').remove();
        $('#randomButton').remove();

        if (dataFavorites.length == 0) {
            let noFavoritesMusics = document.createElement('div');
            noFavoritesMusics.className = 'noFavoritesMusics';
            noFavoritesMusics.innerHTML = '<p>Adicione sua música favorita.</p>';
            deezerAPI.appendChild(noFavoritesMusics);

        } else {
            for (const dataFavoriteKey in dataFavorites) {
                /*RECUPERAR VIA API*/
                searchAPITracks(dataFavorites[dataFavoriteKey],
                    function (musics) {
                        $('.div-error').remove();
                        deezerAPI.appendChild(CreateTrackCard(musics,dataFavorites));
                    },
                    function () {
                        deezerAPI.appendChild(alert('erro','Erro','Ocorreu um erro durante a solicitação, verifique sua conexão com a internet. Se o problema persistir, entre em contato com o suporte.</p>'));
                    });
            }
        }

    }
}