import axios from 'axios'

const ETUDIANT_API_BASE_URL = 'http://localhost:8080/api/Q1'
const Gestion = 'http://localhost:8080/api/Q2'
const Eco = 'http://localhost:8080/api/Q3'
const Nb = 'http://localhost:8080/api/cours'
const cr = 'http://localhost:8080/api/createCours'

class EtudiantService{
    getEtudiants(){
        return axios.get(ETUDIANT_API_BASE_URL);
    }
    getgestion(){
        return axios.get(Gestion);
    }
    geteco(){
        return axios.get(Eco);
    }
    getnombre(){
        return axios.get(Nb);

    }
    create(etud){
        return axios.post(cr, etud);
    }

    
}
export default new EtudiantService()