import React from 'react'
import { Button, Form } from 'semantic-ui-react'

export default function Login() {
    return (
        <div>
            <Form>
                <Form.Field>
                    <label>Username</label>
                    <input placeholder='Username' type='text' />
                </Form.Field>
                <Form.Field>
                    <label>Password</label>
                    <input placeholder='Password' type='password' />
                </Form.Field>
                <Button type='submit' color='primary'>Login</Button>
            </Form>
        </div>
    )
}
