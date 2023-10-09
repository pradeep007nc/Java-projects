import { Component } from '@angular/core';
import { AxiosService } from '../services/axios.service';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent {

  constructor(private axiosService: AxiosService){}

  onLogin(input: any): void{
    this.axiosService.request(
      "POST",
      "/login",
      {
        login: input.login,
        password: input.password
      }
    ).then(response => {
      console.log(response)
    }).catch(error => {
      console.log("mama mia")
    })
  }
}
