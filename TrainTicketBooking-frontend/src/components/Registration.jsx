import React from 'react'
import { Button, Form } from 'semantic-ui-react'

export default function Registration() {
    const genderOptions = [
        { key: 'm', text: 'Male', value: 'male' },
        { key: 'f', text: 'Female', value: 'female' },
        { key: 'o', text: 'Other', value: 'other' },
    ]
    return (
        <div>
            <Form>
                <Form.Group widths='equal'>
                    <Form.Field>
                        <label>First Name</label>
                        <input placeholder='First Name' />
                    </Form.Field>
                    <Form.Field>
                        <label>Last Name</label>
                        <input placeholder='Last Name' />
                    </Form.Field>
                </Form.Group>
                <Form.Group widths='equal'>
                    <Form.Select
                        fluid
                        label='Gender'
                        options={genderOptions}
                        placeholder='Gender'
                    />
                    <Form.Field>
                        <label>Age</label>
                        <input placeholder='Age' type='number' />
                    </Form.Field>
                </Form.Group>
                <Form.Field>
                    <label>Username</label>
                    <input placeholder='Username' type='text' />
                </Form.Field>
                <Form.Group widths='equal'>
                    <Form.Field>
                        <label>Password</label>
                        <input placeholder='Password' type='password' />
                    </Form.Field>
                    <Form.Field>
                        <label>Confirm Password</label>
                        <input placeholder='Confirm Password' type='password' />
                    </Form.Field>
                </Form.Group>
                <Form.TextArea label='Address' placeholder='Write your full address' />
                <Button type='submit' color='primary'>Sign Up</Button>
            </Form>
        </div>
    )
}
