import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
  firebaseURL = 'https://ust-ty-2614e.firebaseio.com/';
 
  

  constructor(public http: HttpClient) { }

postUser(data){
    console.log('service', data);
    return this.http.post(`${this.firebaseURL}/users.json`,data);
  }
getusers() {
  return this.http.get(`${this.firebaseURL}/users.json`).pipe(
    map(data => {
      let newArray = [];
      for(let key in data) {
        newArray.push({...data[key],id:key}) //it converts it to array form
      }
      return newArray;

    })
  )

}
updateUser(id , data) {
  return this.http.put(`${this.firebaseURL}/users/${id}.json` , data)

}

deleteUser(id) {
  return this.http.delete(`${this.firebaseURL}/users/${id}.json`)

}

}
