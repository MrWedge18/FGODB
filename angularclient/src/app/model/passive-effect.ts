import { Effect } from './effect';

export class PassiveEffect {

	id: number;
	iconUrl: string;
	value: number;
	chance: number;
	notes: string;
	valueIsPercentage: boolean;

	effect: Effect;
}
