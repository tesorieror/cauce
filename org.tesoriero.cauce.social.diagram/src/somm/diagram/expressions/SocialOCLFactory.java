package somm.diagram.expressions;

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

import somm.diagram.part.SocialDiagramEditorPlugin;

/**
 * @generated
 */
public class SocialOCLFactory {

	/**
	 * @generated
	 */
	private final SocialAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected SocialOCLFactory() {
		this.expressions = new SocialAbstractExpression[21];
		this.expressionBodies = new String[] {
				"society.individuals->iterate(c; m:Integer=0 | m.max(c.id)).max(society.roles->iterate(c; m:Integer=0 | m.max(c.id))).max(society.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(society.relaizations->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"\'Individual\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"society.individuals->iterate(c; m:Integer=0 | m.max(c.id)).max(society.roles->iterate(c; m:Integer=0 | m.max(c.id))).max(society.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(society.relaizations->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"\'Role\'.concat(\r\nlet number: Integer = id \r\nin OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif\r\n))", //$NON-NLS-1$
				"society.individuals->iterate(c; m:Integer=0 | m.max(c.id)).max(society.roles->iterate(c; m:Integer=0 | m.max(c.id))).max(society.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(society.relaizations->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"society.individuals->iterate(c; m:Integer=0 | m.max(c.id)).max(society.roles->iterate(c; m:Integer=0 | m.max(c.id))).max(society.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(society.relaizations->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"source<>target", //$NON-NLS-1$
				"society.generalizations->forAll(g| (g<>self) implies ((g.source<>self.source) or (g.target<>self.target)))", //$NON-NLS-1$
				"society.generalizations->forAll(g | (g <> self) implies (g.id <> self.id)) and\r\nsociety.individuals->forAll(i | (i.id <> self.id)) and\r\nsociety.roles->forAll(r | r.id <> self.id) and\r\nsociety.relaizations->forAll(real| real.id<>self.id)", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"society.generalizations->forAll(g | g.id <> self.id) and\r\nsociety.individuals->forAll(i | (i <> self) implies (i.id <> self.id)) and\r\nsociety.roles->forAll(r | r.id <> self.id) and\r\nsociety.relaizations->forAll(real| real.id<>self.id)", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"society.individuals->forAll(i | (i <> self) implies (i.name <> self.name)) and\r\nsociety.roles->forAll(r | r.name <> self.name)\r\n", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"society.generalizations->forAll(g | g.id <> self.id) and\r\nsociety.individuals->forAll(i | (i.id <> self.id)) and\r\nsociety.roles->forAll(r | (r <> self) implies (r.id <> self.id)) and\r\nsociety.relaizations->forAll(real| real.id<>self.id)", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"society.individuals->forAll(i |(i.name <> self.name)) and\r\nsociety.roles->forAll(r |  (r <> self) implies (r.name <> self.name))\r\n", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"society.generalizations->forAll(g | (g.id <> self.id)) and\r\nsociety.individuals->forAll(i | (i.id <> self.id)) and\r\nsociety.roles->forAll(r | r.id <> self.id) and\r\nsociety.relaizations->forAll(real| (real <> self) implies (real.id<>self.id))", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static SocialOCLFactory getInstance() {
		SocialOCLFactory instance = SocialDiagramEditorPlugin.getInstance()
				.getSocialOCLFactory();
		if (instance == null) {
			SocialDiagramEditorPlugin.getInstance().setSocialOCLFactory(
					instance = new SocialOCLFactory());
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
	public static SocialAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		SocialOCLFactory cached = getInstance();
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
	public static SocialAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static SocialAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends SocialAbstractExpression {

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
