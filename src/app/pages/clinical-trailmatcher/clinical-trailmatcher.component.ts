import { Component } from '@angular/core';
import { max, min } from 'rxjs';

@Component({
  selector: 'app-clinical-trailmatcher',
  templateUrl: './clinical-trailmatcher.component.html',
  styleUrls: ['./clinical-trailmatcher.component.css']
})
export class ClinicalTrailmatcherComponent {

  searchDisease: string = '';
  searchAge: number | null = null;

  trials = [
    {
      id: 'CT001',
      disease: 'Diabetes',
      title: 'Diabetes Research Trial',
      location: 'Hyderabad',
      status: 'Open',
      minAge: 18,
      maxAge: 60
    },
    {
      id: 'CT002',
      disease: 'Hypertension',
      title: 'Heart Care Study',
      location: 'Bangalore',
      status: 'Recruiting',
      minAge: 25,
      maxAge: 65

    },
    {
      id: 'CT003',
      disease: 'Cancer',
      title: 'Cancer Immunotherapy',
      location: 'Chennai',
      status: 'Open',
      minAge: 35,
      maxAge: 70
    }
  ];

 get filteredTrials() {
  return this.trials.filter(t =>
    t.disease.toLowerCase().includes(this.searchDisease.toLowerCase()) &&
    (
      this.searchAge == null ||
      (this.searchAge >= t.minAge && this.searchAge <= t.maxAge)
    )
  );
}
 searchTrials() {

  if (this.searchDisease.trim() == '') {

    alert("Please Enter Disease");

    return;

  }

  if (this.filteredTrials.length === 0) {

    alert("No Matching Trials Found");

  } else {

    alert(this.filteredTrials.length + " Trial(s) Found");

  }

}

  matchTrial(trial: any) {

    alert(
      'Matched Trial\n\n' +
      'Trial ID: ' + trial.id +
      '\nTitle: ' + trial.title +
      '\nDisease: ' + trial.disease +
      '\nLocation: ' + trial.location +
      '\nStatus: ' + trial.status
    );

  }

}