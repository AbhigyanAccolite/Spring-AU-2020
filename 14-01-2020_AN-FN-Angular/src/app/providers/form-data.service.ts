import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FormDataService {

  formData: Object[] = []

  setData(value: any) {    
    this.formData.push(value);
  }

  getData() {
    return this.formData;    
  }


  deleteData(id) {
    this.formData.splice(id,1);
  }

  constructor() { }
}
