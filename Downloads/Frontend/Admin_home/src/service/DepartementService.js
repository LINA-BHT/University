import axios from 'axios'

const ETUDIANT_API_BASE_URL = 'http://localhost:8080/api/departements'


class EtudiantService{
    getEtudiants(){
        return axios.get(ETUDIANT_API_BASE_URL);
    }
    
}
export default new EtudiantService()