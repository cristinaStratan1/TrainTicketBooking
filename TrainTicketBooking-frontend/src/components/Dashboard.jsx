import React, { Component } from 'react';
import LeftPartition from './left-partition/LeftPartition';
import RightPartition from './right-partiotion/RightPartition';
import Grid from '@material-ui/core/Grid';
import Appbar from './Common/Appbar';
import axios from "axios";

export default class Dashboard extends Component {
    constructor(props) {
        super(props)
        this.getData();

        this.state = {

        }
    }

    getData = () => {
        axios.get("https://randomuser.me/api/")
            // .then(response => response.json())
            .then(response => {
                console.log("response: ", response);
            })
            .catch(errors => {
                console.log("errors: ", errors);
            })
    }


    render() {
        return (
            <div className='dashboard' >
                <Appbar></Appbar>
                <Grid
                    container
                    direction="row"
                    justify="space-around"
                    alignItems="stretch"
                >
                    <Grid xs={5}>
                        <LeftPartition></LeftPartition>
                    </Grid>
                    <Grid xs={7}>
                        <RightPartition></RightPartition>
                    </Grid>
                </Grid>
            </div>
        )
    }
}