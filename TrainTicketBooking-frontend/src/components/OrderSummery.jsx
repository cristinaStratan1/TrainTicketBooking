import React from 'react'
import { Button } from 'semantic-ui-react';

export default function OrderSummery(props) {
    const { selectedTrain, user, payment } = props;
    const finalAmount = user.finalAmount;//100
    const gst = (0.15 * finalAmount);
    const baseFare = finalAmount - (gst + 10);//80
    const bookingCharge = 10;


    const bookTicketSubmit = () => {
        console.log("Ticket Booked Successfuly");
        const message = "Ticket Booked Successfuly";
        props.onClickConfirmBooking(message);
    }

    const handleBackClick = (event) => {
        props.onBackClick(event.target.value)
    }

    return (
        <div>
            <h1 style={{ marginLeft: '4%' }}>Train Info</h1>
            <div style={{ display: 'flex', justifyContent: 'space-around' }}>
                <div style={{ display: 'flex' }}>
                    <h4>Train: </h4>
                    <p>&nbsp;{selectedTrain.TrainNo}/{selectedTrain.TrainName}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Source: </h4>
                    <p>&nbsp;{selectedTrain.Source}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Destination: </h4>
                    <p>&nbsp;{selectedTrain.Destination}</p>
                </div>
            </div>
            <div style={{ display: 'flex', justifyContent: 'space-around' }}>
                <div style={{ display: 'flex' }}>
                    <h4>Arrival Time: </h4>
                    <p>&nbsp;{selectedTrain.ArrivalTime} IST</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Departure Time: </h4>
                    <p>&nbsp;{selectedTrain.DepartureTime}IST</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Fare: </h4>
                    <p>&nbsp;${selectedTrain.fare}.00</p>
                </div>
            </div>
            <h1 style={{ marginLeft: '4%' }}>User Info</h1>
            <div style={{ display: 'flex', justifyContent: 'space-around' }}>
                <div style={{ display: 'flex' }}>
                    <h4>Full Name: </h4>
                    <p>&nbsp;{user.firstName}&nbsp;{user.lastName}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Gender: </h4>
                    <p>&nbsp;{user.gender}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Number of Tickets: </h4>
                    <p>&nbsp;{user.passengerCount}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Age: </h4>
                    <p>&nbsp;{user.age}</p>
                </div>
            </div>
            <div style={{ display: 'flex', marginLeft: '8%' }}>
                <h4>Address: </h4>
                <p>&nbsp;{user.address}</p>
            </div>
            <h1 style={{ marginLeft: '4%' }}>Payment Info</h1>
            <div style={{ display: 'flex', justifyContent: 'space-around' }}>
                <div style={{ display: 'flex' }}>
                    <h4>BaseFare: </h4>
                    <p>&nbsp;$.{baseFare}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>15% GST: </h4>
                    <p>&nbsp;$.{gst}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h4>Booking Charge: </h4>
                    <p>&nbsp;$.{bookingCharge}</p>
                </div>
            </div>
            <div style={{ display: 'flex', justifyContent: 'space-evenly' }}>
                <div style={{ display: 'flex' }}>
                    <h4>Payment Type: </h4>
                    <p>&nbsp;{payment}</p>
                </div>
                <div style={{ display: 'flex' }}>
                    <h3>Final Amount: $.&nbsp;{finalAmount}.00</h3>
                </div>
            </div>
            <Button positive floated="left"
                style={{ margin: '1rem' }}
                onClick={handleBackClick}
                value="payment"
            >Back
            </Button>
            <Button type='submit'
                color='primary'
                floated='right'
                style={{ margin: '0.5rem', padding: '1rem 2rem' }}
                onClick={bookTicketSubmit}
            >Confirm Your Booking
            </Button>
        </div >
    )
}
