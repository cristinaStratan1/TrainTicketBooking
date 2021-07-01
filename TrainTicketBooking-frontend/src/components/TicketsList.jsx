import React, { useState } from 'react'
import { Header, Table, Rating, Menu, Icon, Button } from 'semantic-ui-react'

const TicketsList = props => {
    const trainsList = props.trainsList;
    console.log("trainsList : ", trainsList);
    const [selectedTrain, setSelectedTrain] = useState();
    return (
        <Table celled padded style={{ margin: 0 }}>
            <Table.Header>
                <Table.Row>
                    <Table.HeaderCell singleLine>Train No.</Table.HeaderCell>
                    <Table.HeaderCell >Train Name</Table.HeaderCell>
                    <Table.HeaderCell>Seats</Table.HeaderCell>
                    <Table.HeaderCell>Arrival</Table.HeaderCell>
                    <Table.HeaderCell>Departure</Table.HeaderCell>
                    <Table.HeaderCell>Travel</Table.HeaderCell>
                    <Table.HeaderCell>Ratings</Table.HeaderCell>
                </Table.Row>
            </Table.Header>

            <Table.Body>
                {
                    trainsList.map(train => {
                        const handleSelectedTrain = event => {
                            setSelectedTrain(train);
                            props.onSelectedTrain(train);
                            console.log("train: ", selectedTrain);
                        }
                        return (<Table.Row onClick={handleSelectedTrain} style={{ cursor: 'pointer' }}>
                            <Table.Cell >
                                <Header as='h2' textAlign='center'>
                                    {train.TrainName.charAt(0)} <h5>{train.TrainNo}</h5>
                                </Header>
                            </Table.Cell>
                            <Table.Cell >{train.TrainName}</Table.Cell>
                            <Table.Cell textAlign='center'
                                positive={train.availableSeats > 100}
                                negative={train.availableSeats <= 100}
                            >
                                <a href='#'>Total: {train.totalSeats}</a> <br />
                                <span>available: {train.availableSeats}</span><br />
                                {train.availableSeats <= 100 ? <h6>Limited Seats</h6> : null}
                            </Table.Cell>
                            <Table.Cell textAlign='center'>
                                {train.ArrivalTime}
                            </Table.Cell>
                            <Table.Cell textAlign='center'>
                                {train.DepartureTime}
                            </Table.Cell>
                            <Table.Cell >
                                <h5 style={{ marginBottom: '0.25rem' }}>{train.Source} - {train.Destination}</h5>
                                <b style={{ color: 'green' }}>
                                    fare: {train.fare}
                                </b>
                            </Table.Cell>
                            <Table.Cell>
                                <Rating disabled defaultRating={train.userRatings} maxRating={5} />
                            </Table.Cell>
                        </Table.Row>)
                    })
                }
            </Table.Body>
            <Table.Footer >
                <Table.Row>
                    <Table.HeaderCell colSpan='7' style={{ padding: '5px' }}>
                        <Menu floated='right' pagination>
                            <Menu.Item as='a' icon>
                                <Icon name='chevron left' />
                            </Menu.Item>
                            <Menu.Item as='a'>1</Menu.Item>
                            <Menu.Item as='a'>2</Menu.Item>
                            <Menu.Item as='a'>3</Menu.Item>
                            <Menu.Item as='a'>4</Menu.Item>
                            <Menu.Item as='a' icon>
                                <Icon name='chevron right' />
                            </Menu.Item>
                        </Menu>
                    </Table.HeaderCell>
                </Table.Row>
            </Table.Footer>
        </Table>
    )
}

export default TicketsList