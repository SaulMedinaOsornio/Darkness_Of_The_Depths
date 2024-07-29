import { describe } from 'vitest'
const { isValidEmail, isValidPassword } = require('./src/main/resources/static/js/login');

describe('Email Validation', () => {
    test('validates correct email', () => {
        expect(isValidEmail('test@example.com')).toBe(true);
    });

    test('invalidates incorrect email', () => {
        expect(isValidEmail('invalid-email')).toBe(false);
    });

    test('invalidates empty email', () => {
        expect(isValidEmail('')).toBe(false);
    });
});

describe('Password Validation', () => {
    test('validates password with correct length', () => {
        expect(isValidPassword('password123')).toBe(true);
    });

    test('invalidates password with less than 8 characters', () => {
        expect(isValidPassword('short')).toBe(false);
    });

    test('invalidates null password', () => {
        expect(isValidPassword(null)).toBe(false);
    });

    test('invalidates empty password', () => {
        expect(isValidPassword('')).toBe(false);
    });
});
