import axios from 'axios'

const ETUDIANT_API_BASE_URL = 'http://localhost:8080/api/enseignants'
const EN = 'http://localhost:8080/api/createEnseignants'

class EtudiantService{
    getEtudiants(){
        return axios.get(ETUDIANT_API_BASE_URL);
    }
    create(ens){
        return axios.post(EN, ens);
    }
}
export default new EtudiantService()