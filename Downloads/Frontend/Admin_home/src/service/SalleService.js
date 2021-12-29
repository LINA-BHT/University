import axios from 'axios'

const ETUDIANT_API_BASE_URL = 'http://localhost:8080/api/lieus'
const salle = 'http://localhost:8080/api//createLieu'

class EtudiantService{
    getEtudiants(){
        return axios.get(ETUDIANT_API_BASE_URL);
    }
    create(etud){
        return axios.post(salle, etud);
    }
}
export default new EtudiantService()