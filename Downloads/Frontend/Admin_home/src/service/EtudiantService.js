import axios from 'axios'

const ETUDIANT_API_BASE_URL = 'http://localhost:8080/api/etudiants'
const et = 'http://localhost:8080/api/createEtudiant'
const etSup = 'http://localhost:8080/api/deleteEtudiant/{id}'
class EtudiantService{
    getEtudiants(){
        return axios.get(ETUDIANT_API_BASE_URL);
    }
    create(etud){
        return axios.post(et, etud);
    }
    delete(id){
        return axios.post(etSup,id)
         
           
    }
    
}
export default new EtudiantService()