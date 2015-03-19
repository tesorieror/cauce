package ecmm.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import ecmm.diagram.part.EntityContextDiagramEditorPlugin;

/**
 * @generated
 */
public class EntityContextOCLFactory {

	/**
	 * @generated
	 */
	private final EntityContextAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected EntityContextOCLFactory() {
		this.expressions = new EntityContextAbstractExpression[51];
		this.expressionBodies = new String[] {
				"system.entities->collect(id)\r\n->union(system.entities->collect(variables->collect(id))->flatten())\r\n->union(system.entities->collect(state->collect(id))->flatten())\r\n->union(system.entities->collect(situations->collect(id))->flatten())\r\n->union(system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'Entity\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"(entityContext.entity.concat(\'.holderMemory\')).concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"(entityContext.entity.concat(\'.stackMemory\')).concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"(entityContext.entity.concat(\'.timeMemory\')).concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"(entityContext.entity.concat(\'.stackMemory\')).concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"(entityContext.entity.concat(\'.dictionaryMemory\')).concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'situation\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"situation.entityContext.system.entities->collect(id)\r\n->union(situation.entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'expression\'", //$NON-NLS-1$
				"situation.entityContext.system.entities->collect(id)\r\n->union(situation.entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'informationFlow\'", //$NON-NLS-1$
				"situation.entityContext.system.entities->collect(id)\r\n->union(situation.entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(situation.entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'expression\'", //$NON-NLS-1$
				"entityContext.system.entities->collect(id)\r\n->union(entityContext.system.entities->collect(variables->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(state->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(id))->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(actions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(sensingConditions->collect(id))->flatten())->flatten())\r\n->union(entityContext.system.entities->collect(situations->collect(memoryConditions->collect(id))->flatten())->flatten())\r\n->iterate(id; answer : Integer = 0 |  answer.max(id)) + 1", //$NON-NLS-1$
				"\'name\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"\'definition\'", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"system.entities->forAll(e | \r\n ((e<>self) implies (e.id<>self.id)) and\r\n e.situations->forAll(s | s.id<>self.id) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc| sc.id<>self.id) and \r\n  s.memoryConditions->forAll(mc|mc.id<>self.id) and\r\n  s.actions->forAll(a|a.id<>self.id) \r\n ) and\r\n e.variables->forAll(v | v.id<>self.id) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)", //$NON-NLS-1$
				"system.entities->forAll(e| (e<>self) implies (e.entity<>self.entity))", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"entityContext.variables->forAll(v| (v<>self) implies(v.name<>self.name))", //$NON-NLS-1$
				"entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s | s.id<>self.id) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc| sc.id<>self.id) and \r\n  s.memoryConditions->forAll(mc|mc.id<>self.id) and\r\n  s.actions->forAll(a|a.id<>self.id) \r\n ) and\r\n e.variables->forAll(v | (v<>self) implies (v.id<>self.id)) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)\r\n", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"situation.entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s | s.id<>self.id) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc| (sc<>self) implies (sc.id<>self.id)) and \r\n  s.memoryConditions->forAll(mc|mc.id<>self.id) and\r\n  s.actions->forAll(a|a.id<>self.id) \r\n ) and\r\n e.variables->forAll(v |  (v.id<>self.id)) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)\r\n", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"situation.entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s | s.id<>self.id) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc|  (sc.id<>self.id)) and \r\n  s.memoryConditions->forAll(mc| (mc<>self) implies (mc.id<>self.id)) and\r\n  s.actions->forAll(a|a.id<>self.id) \r\n ) and\r\n e.variables->forAll(v |  (v.id<>self.id)) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)\r\n", //$NON-NLS-1$
				"entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s | (s<>self) implies (s.id<>self.id)) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc|  (sc.id<>self.id)) and \r\n  s.memoryConditions->forAll(mc|  (mc.id<>self.id)) and\r\n  s.actions->forAll(a|a.id<>self.id) \r\n ) and\r\n e.variables->forAll(v |  (v.id<>self.id)) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)\r\n", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"entityContext.situations->forAll(s| (s<>self) implies (s.name<>self.name))", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"situation.entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s |  (s.id<>self.id)) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc|  (sc.id<>self.id)) and \r\n  s.memoryConditions->forAll(mc|  (mc.id<>self.id)) and\r\n  s.actions->forAll(a | (a<>self) implies (a.id<>self.id)) \r\n ) and\r\n e.variables->forAll(v |  (v.id<>self.id)) and\r\n e.state->forAll(st | st.id<>self.id)\r\n)\r\n", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"situation.entityContext.state->collect(name)->includes(self.memoryName)", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"entityContext.state->forAll(s | (s<>self) implies (s.name<>self.name))", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"entityContext.system.entities->forAll(e | \r\n (e.id<>self.id) and\r\n e.situations->forAll(s |  (s.id<>self.id)) and\r\n e.situations->forAll(s | \r\n  s.sensingConditions->forAll(sc|  (sc.id<>self.id)) and \r\n  s.memoryConditions->forAll(mc|  (mc.id<>self.id)) and\r\n  s.actions->forAll(a | (a.id<>self.id)) \r\n ) and\r\n e.variables->forAll(v |  (v.id<>self.id)) and\r\n e.state->forAll(st | (st<>self) implies (st.id<>self.id))\r\n)\r\n", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static EntityContextOCLFactory getInstance() {
		EntityContextOCLFactory instance = EntityContextDiagramEditorPlugin
				.getInstance().getEntityContextOCLFactory();
		if (instance == null) {
			EntityContextDiagramEditorPlugin.getInstance()
					.setEntityContextOCLFactory(
							instance = new EntityContextOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static EntityContextAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		EntityContextOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static EntityContextAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static EntityContextAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends EntityContextAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
