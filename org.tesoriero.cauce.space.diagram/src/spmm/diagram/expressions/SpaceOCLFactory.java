package spmm.diagram.expressions;

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

import spmm.diagram.part.SpaceDiagramEditorPlugin;

/**
 * @generated
 */
public class SpaceOCLFactory {

	/**
	 * @generated
	 */
	private final SpaceAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected SpaceOCLFactory() {
		this.expressions = new SpaceAbstractExpression[23];
		this.expressionBodies = new String[] {
				"universe.physicalSpaces->iterate(c; m:Integer=0 | m.max(c.id)).max(universe.virtualSpaces->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.representations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.groupings->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.contentions->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"\'PhysicalSpace\'.concat( let number: Integer = id in OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}\r\n->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif))", //$NON-NLS-1$
				"universe.physicalSpaces->iterate(c; m:Integer=0 | m.max(c.id)).max(universe.virtualSpaces->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.representations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.groupings->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.contentions->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"\'VirtualSpace\'.concat( let number: Integer = id in OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' | let numberAsString : String= OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}\r\n->at(number.div(denominator).mod(10) + 1)\r\nin if s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif))", //$NON-NLS-1$
				"universe.physicalSpaces->iterate(c; m:Integer=0 | m.max(c.id)).max(universe.virtualSpaces->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.representations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.groupings->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.contentions->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"universe.physicalSpaces->iterate(c; m:Integer=0 | m.max(c.id)).max(universe.virtualSpaces->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.representations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.groupings->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.contentions->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"universe.physicalSpaces->iterate(c; m:Integer=0 | m.max(c.id)).max(universe.virtualSpaces->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.generalizations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.representations->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.groupings->iterate(c; m:Integer=0 | m.max(c.id))).max(universe.contentions->iterate(c; m:Integer=0 | m.max(c.id))) +1", //$NON-NLS-1$
				"parent.id<>child.id", //$NON-NLS-1$
				"parent.id<>child.id", //$NON-NLS-1$
				"generalizes.id<>parent.id", //$NON-NLS-1$
				"universe.groupings->forAll(g| (g.parent.id<>parent.id or g.child.id<>child.id) or (g.id=id))", //$NON-NLS-1$
				"universe.generalizations->forAll(g| (g.parent.id<>parent.id or g.generalizes.id<>generalizes.id) or (g.id=id))", //$NON-NLS-1$
				"universe.contentions->forAll(g| (g.parent.id<>parent.id or g.child.id<>child.id) or (g.id=id))", //$NON-NLS-1$
				"(universe.id<>self.id) and\r\nuniverse.physicalSpaces->forAll(phs|  (phs.id<>self.id)) and\r\nuniverse.virtualSpaces->forAll(vs| (vs.id<>self.id)) and\r\nuniverse.groupings->forAll(g | (g<>self) implies (g.id<>self.id)) and\r\nuniverse.generalizations->forAll(gens | (gens.id<>self.id)) and\r\nuniverse.contentions->forAll(c | (c.id<>self.id))", //$NON-NLS-1$
				"(universe.id<>self.id) and\r\nuniverse.physicalSpaces->forAll(phs|  (phs.id<>self.id)) and\r\nuniverse.virtualSpaces->forAll(vs| (vs.id<>self.id)) and\r\nuniverse.groupings->forAll(g | g.id<>self.id) and\r\nuniverse.generalizations->forAll(gens | (gens.id<>self.id)) and\r\nuniverse.contentions->forAll(c | (c<>self) implies (c.id<>self.id))", //$NON-NLS-1$
				"(universe.id<>self.id) and\r\nuniverse.physicalSpaces->forAll(phs | (phs.id<>self.id)) and\r\nuniverse.virtualSpaces->forAll(vs | (vs.id<>self.id)) and\r\nuniverse.groupings->forAll(g | g.id<>self.id) and\r\nuniverse.generalizations->forAll(gens | (gens<>self) implies (gens.id<>self.id)) and\r\nuniverse.contentions->forAll(c | c.id<>self.id)", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"(universe.name<>self.name) and\r\nuniverse.physicalSpaces->forAll(phs | (phs<>self) implies (phs.name<>self.name)) and\r\nuniverse.virtualSpaces->forAll(vs | (vs.name<>self.name))", //$NON-NLS-1$
				"(universe.id<>self.id) and\r\nuniverse.physicalSpaces->forAll(phs | (phs<>self) implies (phs.id<>self.id)) and\r\nuniverse.virtualSpaces->forAll(vs | (vs.id<>self.id)) and\r\nuniverse.groupings->forAll(g | g.id<>self.id) and\r\nuniverse.generalizations->forAll(gens | gens.id<>self.id) and\r\nuniverse.contentions->forAll(c | c.id<>self.id)", //$NON-NLS-1$
				"(universe.name<>self.name) and\r\nuniverse.physicalSpaces->forAll(phs |  (phs.name<>self.name)) and\r\nuniverse.virtualSpaces->forAll(vs | (vs<>self) implies (vs.name<>self.name))", //$NON-NLS-1$
				"(universe.id<>self.id) and\r\nuniverse.physicalSpaces->forAll(phs | phs.id<>self.id) and\r\nuniverse.virtualSpaces->forAll(vs | (self<>vs) implies (vs.id<>self.id)) and\r\nuniverse.groupings->forAll(g | g.id<>self.id) and\r\nuniverse.generalizations->forAll(gens | gens.id<>self.id) and\r\nuniverse.contentions->forAll(c | c.id<>self.id)", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static SpaceOCLFactory getInstance() {
		SpaceOCLFactory instance = SpaceDiagramEditorPlugin.getInstance()
				.getSpaceOCLFactory();
		if (instance == null) {
			SpaceDiagramEditorPlugin.getInstance().setSpaceOCLFactory(
					instance = new SpaceOCLFactory());
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
	public static SpaceAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		SpaceOCLFactory cached = getInstance();
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
	public static SpaceAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static SpaceAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends SpaceAbstractExpression {

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
