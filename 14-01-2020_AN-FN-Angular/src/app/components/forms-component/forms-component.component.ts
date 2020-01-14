import { FormDataService } from './../../providers/form-data.service';
import { Component, OnInit } from '@angular/core';
import { Validators} from '@angular/forms'; 
import { FormBuilder } from '@angular/forms';


@Component({
  selector: 'app-forms-component',
  templateUrl: './forms-component.component.html',
  styleUrls: ['./forms-component.component.css'],
  
})
export class FormsComponentComponent implements OnInit {

  

  constructor(public fb: FormBuilder, private service: FormDataService) { }

  profileForm = this.fb.group({
    id: ['', Validators.required],
    firstName: ['', Validators.required],
    lastName: ['', Validators.required],
    address: this.fb.group({
      street: ['', Validators.required],
      city: ['', Validators.required],
      state: ['', Validators.required],
      zip: ['']
    }),
  });

  onSubmit() {    
    console.log(this.profileForm.value);
    this.service.setData(this.profileForm.value);
  }

  ngOnInit() {
  }

}
