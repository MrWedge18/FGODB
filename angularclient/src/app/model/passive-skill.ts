import { PassiveEffect } from './passive-effect';

export class PassiveSkill {
	id: number;
	iconUrl: string;
	name: string;
	rank: string;

	passiveEffects: PassiveEffect[];
}
