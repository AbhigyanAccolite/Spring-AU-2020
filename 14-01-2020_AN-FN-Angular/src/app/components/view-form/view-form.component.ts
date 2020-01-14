import { Component, OnInit } from '@angular/core';
import { FormDataService } from './../../providers/form-data.service';

@Component({
  selector: 'app-view-form',
  templateUrl: './view-form.component.html',
  styleUrls: ['./view-form.component.css']
})

export class ViewFormComponent  implements OnInit {
  
    data: Object[];

    constructor(public service: FormDataService) {
      this.data = this.service.getData();
      console.log(this.data);
      console.log(typeof(this.data));
    }

    onDelete(id) {
      console.log(id);
      this.service.deleteData(id);
    }

    ngOnInit() {

    }
  }  


